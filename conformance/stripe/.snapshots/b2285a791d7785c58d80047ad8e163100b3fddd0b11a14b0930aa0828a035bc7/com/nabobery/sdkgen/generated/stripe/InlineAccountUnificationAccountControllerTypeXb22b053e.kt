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
 * The controller type. Can be `application`, if a Connect application controls the account, or `account`, if the
 * account controls itself.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller/properties/type
 */
@Serializable(with = InlineAccountUnificationAccountControllerTypeXb22b053e.Serializer::class)
public sealed class InlineAccountUnificationAccountControllerTypeXb22b053e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineAccountUnificationAccountControllerTypeXb22b053e() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `application`.
   */
  public data object Application : InlineAccountUnificationAccountControllerTypeXb22b053e() {
    public override val `value`: String = "application"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountUnificationAccountControllerTypeXb22b053e()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountUnificationAccountControllerTypeXb22b053e = when (value) {
      Account.value -> Account
      Application.value -> Application
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountUnificationAccountControllerTypeXb22b053e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountUnificationAccountControllerTypeXb22b053e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountUnificationAccountControllerTypeXb22b053e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountUnificationAccountControllerTypeXb22b053e) {
      encoder.encodeString(value.value)
    }
  }
}
