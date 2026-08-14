package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The layout of the view.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{user_id}~1projectsV2~1{project_number}~1views/post/requestBody/content/
 * application~1json/schema/properties/layout
 */
@Serializable(with = InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f.Serializer::class)
public sealed class InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `table`.
   */
  public data object Table : InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f() {
    public override val `value`: String = "table"
  }

  /**
   * Documented value. Wire value: `board`.
   */
  public data object Board : InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f() {
    public override val `value`: String = "board"
  }

  /**
   * Documented value. Wire value: `roadmap`.
   */
  public data object Roadmap : InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f() {
    public override val `value`: String = "roadmap"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f = when (value) {
      Table.value -> Table
      Board.value -> Board
      Roadmap.value -> Roadmap
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f) {
      encoder.encodeString(value.value)
    }
  }
}
