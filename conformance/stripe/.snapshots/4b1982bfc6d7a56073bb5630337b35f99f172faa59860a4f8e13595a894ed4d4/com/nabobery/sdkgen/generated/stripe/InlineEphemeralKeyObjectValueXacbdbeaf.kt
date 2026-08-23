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
 * Source: sdkgen://source/openapi.json#/components/schemas/ephemeral_key/properties/object
 */
@Serializable(with = InlineEphemeralKeyObjectValueXacbdbeaf.Serializer::class)
public sealed class InlineEphemeralKeyObjectValueXacbdbeaf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ephemeral_key`.
   */
  public data object EphemeralKey : InlineEphemeralKeyObjectValueXacbdbeaf() {
    public override val `value`: String = "ephemeral_key"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEphemeralKeyObjectValueXacbdbeaf()

  public companion object {
    public fun fromValue(`value`: String): InlineEphemeralKeyObjectValueXacbdbeaf = when (value) {
      EphemeralKey.value -> EphemeralKey
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEphemeralKeyObjectValueXacbdbeaf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineEphemeralKeyObjectValueXacbdbeaf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEphemeralKeyObjectValueXacbdbeaf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEphemeralKeyObjectValueXacbdbeaf) {
      encoder.encodeString(value.value)
    }
  }
}
