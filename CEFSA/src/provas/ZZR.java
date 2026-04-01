package provas;

public class ZZR {

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Aluno aluno = (Aluno) o;
		return getId() == aluno.getId();
	}
}
