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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_session/properties/object
 */
@Serializable(with = InlineAccountSessionObjectValueX2a6321e2.Serializer::class)
public sealed class InlineAccountSessionObjectValueX2a6321e2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_session`.
   */
  public data object AccountSession : InlineAccountSessionObjectValueX2a6321e2() {
    public override val `value`: String = "account_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountSessionObjectValueX2a6321e2()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountSessionObjectValueX2a6321e2 = when (value) {
      AccountSession.value -> AccountSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountSessionObjectValueX2a6321e2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountSessionObjectValueX2a6321e2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountSessionObjectValueX2a6321e2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountSessionObjectValueX2a6321e2) {
      encoder.encodeString(value.value)
    }
  }
}
