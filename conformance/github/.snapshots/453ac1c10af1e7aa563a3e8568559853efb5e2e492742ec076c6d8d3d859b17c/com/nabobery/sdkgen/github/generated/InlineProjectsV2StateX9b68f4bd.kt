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
 * The current state of the project.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2/properties/state
 */
@Serializable(with = InlineProjectsV2StateX9b68f4bd.Serializer::class)
public sealed class InlineProjectsV2StateX9b68f4bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineProjectsV2StateX9b68f4bd() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineProjectsV2StateX9b68f4bd() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProjectsV2StateX9b68f4bd()

  public companion object {
    public fun fromValue(`value`: String): InlineProjectsV2StateX9b68f4bd = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineProjectsV2StateX9b68f4bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineProjectsV2StateX9b68f4bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProjectsV2StateX9b68f4bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2StateX9b68f4bd) {
      encoder.encodeString(value.value)
    }
  }
}
