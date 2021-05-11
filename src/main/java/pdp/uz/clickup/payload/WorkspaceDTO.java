package pdp.uz.clickup.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class WorkspaceDTO {

    @NotNull
    private String name;
    @NotNull
    private String color;
    private Long attachmentId;
}
