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
 * The type of account link the user is requesting.
 *
 * You can create Account Links of type `account_update` only for connected accounts where your platform is responsible
 * for collecting requirements, including Custom accounts. You can't create them for accounts that have access to a
 * Stripe-hosted Dashboard. If you use [Connect embedded components](/connect/get-started-connect-embedded-components),
 * you can include components that allow your connected accounts to update their own information. For an account without
 * Stripe-hosted Dashboard access where Stripe is liable for negative balances, you must use embedded components.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/type
 */
@Serializable(with = InlineV1AccountLinksPostRequestFormTypeX021e3a7f.Serializer::class)
public sealed class InlineV1AccountLinksPostRequestFormTypeX021e3a7f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_onboarding`.
   */
  public data object AccountOnboarding : InlineV1AccountLinksPostRequestFormTypeX021e3a7f() {
    public override val `value`: String = "account_onboarding"
  }

  /**
   * Documented value. Wire value: `account_update`.
   */
  public data object AccountUpdate : InlineV1AccountLinksPostRequestFormTypeX021e3a7f() {
    public override val `value`: String = "account_update"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountLinksPostRequestFormTypeX021e3a7f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountLinksPostRequestFormTypeX021e3a7f = when (value) {
      AccountOnboarding.value -> AccountOnboarding
      AccountUpdate.value -> AccountUpdate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountLinksPostRequestFormTypeX021e3a7f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountLinksPostRequestFormTypeX021e3a7f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountLinksPostRequestFormTypeX021e3a7f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountLinksPostRequestFormTypeX021e3a7f) {
      encoder.encodeString(value.value)
    }
  }
}
