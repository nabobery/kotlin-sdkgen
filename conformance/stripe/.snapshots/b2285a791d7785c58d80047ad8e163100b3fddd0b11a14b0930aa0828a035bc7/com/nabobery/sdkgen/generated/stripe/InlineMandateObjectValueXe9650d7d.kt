package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate/properties/object
 */
@Serializable(with = InlineMandateObjectValueXe9650d7d.Serializer::class)
public sealed class InlineMandateObjectValueXe9650d7d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mandate`.
   */
  public data object Mandate : InlineMandateObjectValueXe9650d7d() {
    public override val `value`: String = "mandate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateObjectValueXe9650d7d()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateObjectValueXe9650d7d = when (value) {
      Mandate.value -> Mandate
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineMandateObjectValueXe9650d7d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineMandateObjectValueXe9650d7d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateObjectValueXe9650d7d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateObjectValueXe9650d7d) {
      encoder.encodeString(value.value)
    }
  }
}
