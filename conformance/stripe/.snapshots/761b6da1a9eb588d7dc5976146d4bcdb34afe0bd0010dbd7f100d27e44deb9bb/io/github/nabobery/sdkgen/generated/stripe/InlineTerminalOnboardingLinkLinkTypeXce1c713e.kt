package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.onboarding_link/properties/link_type
 */
@Serializable(with = InlineTerminalOnboardingLinkLinkTypeXce1c713e.Serializer::class)
public sealed class InlineTerminalOnboardingLinkLinkTypeXce1c713e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apple_terms_and_conditions`.
   */
  public data object AppleTermsAndConditions : InlineTerminalOnboardingLinkLinkTypeXce1c713e() {
    public override val `value`: String = "apple_terms_and_conditions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalOnboardingLinkLinkTypeXce1c713e()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalOnboardingLinkLinkTypeXce1c713e = when (value) {
      AppleTermsAndConditions.value -> AppleTermsAndConditions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalOnboardingLinkLinkTypeXce1c713e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTerminalOnboardingLinkLinkTypeXce1c713e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalOnboardingLinkLinkTypeXce1c713e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalOnboardingLinkLinkTypeXce1c713e) {
      encoder.encodeString(value.value)
    }
  }
}
