package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ResponseHealingPlugin/properties/id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponseHealingPlugin/properties/id
 */
@Serializable(with = InlineResponseHealingPluginIdX79023015.Serializer::class)
public sealed class InlineResponseHealingPluginIdX79023015 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response-healing`.
   */
  public data object ResponseHealing : InlineResponseHealingPluginIdX79023015() {
    public override val `value`: String = "response-healing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineResponseHealingPluginIdX79023015()

  public companion object {
    public fun fromValue(`value`: String): InlineResponseHealingPluginIdX79023015 = when (value) {
      ResponseHealing.value -> ResponseHealing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineResponseHealingPluginIdX79023015> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineResponseHealingPluginIdX79023015", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineResponseHealingPluginIdX79023015 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineResponseHealingPluginIdX79023015) {
      encoder.encodeString(value.value)
    }
  }
}
