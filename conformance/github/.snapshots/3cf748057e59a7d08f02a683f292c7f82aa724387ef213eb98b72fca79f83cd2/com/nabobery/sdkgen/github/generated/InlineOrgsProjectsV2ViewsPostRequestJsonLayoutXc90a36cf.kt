package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1views/post/requestBody/content/appli
 * cation~1json/schema/properties/layout
 */
@Serializable(with = InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf.Serializer::class)
public sealed class InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `table`.
   */
  public data object Table : InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf() {
    public override val `value`: String = "table"
  }

  /**
   * Documented value. Wire value: `board`.
   */
  public data object Board : InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf() {
    public override val `value`: String = "board"
  }

  /**
   * Documented value. Wire value: `roadmap`.
   */
  public data object Roadmap : InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf() {
    public override val `value`: String = "roadmap"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf = when (value) {
      Table.value -> Table
      Board.value -> Board
      Roadmap.value -> Roadmap
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf) {
      encoder.encodeString(value.value)
    }
  }
}
