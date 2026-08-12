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
 * The type of link being generated.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1onboarding_links/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/link_type
 */
@Serializable(with = InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87.Serializer::class)
public sealed class InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apple_terms_and_conditions`.
   */
  public data object AppleTermsAndConditions : InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87() {
    public override val `value`: String = "apple_terms_and_conditions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87 = when (value) {
      AppleTermsAndConditions.value -> AppleTermsAndConditions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87) {
      encoder.encodeString(value.value)
    }
  }
}
