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
 * Source: sdkgen://source/openapi.json#/components/schemas/topup/properties/object
 */
@Serializable(with = InlineTopupObjectValueXef89b750.Serializer::class)
public sealed class InlineTopupObjectValueXef89b750 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `topup`.
   */
  public data object Topup : InlineTopupObjectValueXef89b750() {
    public override val `value`: String = "topup"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTopupObjectValueXef89b750()

  public companion object {
    public fun fromValue(`value`: String): InlineTopupObjectValueXef89b750 = when (value) {
      Topup.value -> Topup
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTopupObjectValueXef89b750> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTopupObjectValueXef89b750", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTopupObjectValueXef89b750 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTopupObjectValueXef89b750) {
      encoder.encodeString(value.value)
    }
  }
}
