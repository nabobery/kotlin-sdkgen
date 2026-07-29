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
 * Type of the account referenced.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_account_reference/properties/type
 */
@Serializable(with = InlineConnectAccountReferenceTypeXc6224d9c.Serializer::class)
public sealed class InlineConnectAccountReferenceTypeXc6224d9c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineConnectAccountReferenceTypeXc6224d9c() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineConnectAccountReferenceTypeXc6224d9c() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConnectAccountReferenceTypeXc6224d9c()

  public companion object {
    public fun fromValue(`value`: String): InlineConnectAccountReferenceTypeXc6224d9c = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineConnectAccountReferenceTypeXc6224d9c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineConnectAccountReferenceTypeXc6224d9c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConnectAccountReferenceTypeXc6224d9c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConnectAccountReferenceTypeXc6224d9c) {
      encoder.encodeString(value.value)
    }
  }
}
