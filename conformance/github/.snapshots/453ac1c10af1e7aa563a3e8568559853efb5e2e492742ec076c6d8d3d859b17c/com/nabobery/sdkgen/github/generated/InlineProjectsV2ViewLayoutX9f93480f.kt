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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-view/properties/layout
 */
@Serializable(with = InlineProjectsV2ViewLayoutX9f93480f.Serializer::class)
public sealed class InlineProjectsV2ViewLayoutX9f93480f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `table`.
   */
  public data object Table : InlineProjectsV2ViewLayoutX9f93480f() {
    public override val `value`: String = "table"
  }

  /**
   * Documented value. Wire value: `board`.
   */
  public data object Board : InlineProjectsV2ViewLayoutX9f93480f() {
    public override val `value`: String = "board"
  }

  /**
   * Documented value. Wire value: `roadmap`.
   */
  public data object Roadmap : InlineProjectsV2ViewLayoutX9f93480f() {
    public override val `value`: String = "roadmap"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProjectsV2ViewLayoutX9f93480f()

  public companion object {
    public fun fromValue(`value`: String): InlineProjectsV2ViewLayoutX9f93480f = when (value) {
      Table.value -> Table
      Board.value -> Board
      Roadmap.value -> Roadmap
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineProjectsV2ViewLayoutX9f93480f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineProjectsV2ViewLayoutX9f93480f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProjectsV2ViewLayoutX9f93480f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2ViewLayoutX9f93480f) {
      encoder.encodeString(value.value)
    }
  }
}
