package ar.edu.undef.fie.moccot_isa.models.response;

public class PersonalResponse {
    public PersonalResponse() {}
    private String rolCombate;

    public PersonalResponse(String rolCombate) {
        this.rolCombate = rolCombate;
    }

    public String getRolCombate() {
        return rolCombate;
    }

    public void setRolCombate(String rolCombate) {
        this.rolCombate = rolCombate;
    }
}
