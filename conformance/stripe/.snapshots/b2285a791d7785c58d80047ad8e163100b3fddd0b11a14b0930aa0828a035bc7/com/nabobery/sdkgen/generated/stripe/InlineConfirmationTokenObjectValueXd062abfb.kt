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
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_token/properties/object
 */
@Serializable(with = InlineConfirmationTokenObjectValueXd062abfb.Serializer::class)
public sealed class InlineConfirmationTokenObjectValueXd062abfb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `confirmation_token`.
   */
  public data object ConfirmationToken : InlineConfirmationTokenObjectValueXd062abfb() {
    public override val `value`: String = "confirmation_token"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConfirmationTokenObjectValueXd062abfb()

  public companion object {
    public fun fromValue(`value`: String): InlineConfirmationTokenObjectValueXd062abfb = when (value) {
      ConfirmationToken.value -> ConfirmationToken
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineConfirmationTokenObjectValueXd062abfb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineConfirmationTokenObjectValueXd062abfb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConfirmationTokenObjectValueXd062abfb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokenObjectValueXd062abfb) {
      encoder.encodeString(value.value)
    }
  }
}
