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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/terminal.onboarding_link/properties/object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.onboarding_link/properties/object
 */
@Serializable(with = InlineTerminalOnboardingLinkObjectValueXbfe4e85f.Serializer::class)
public sealed class InlineTerminalOnboardingLinkObjectValueXbfe4e85f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `terminal.onboarding_link`.
   */
  public data object TerminalOnboardingLink : InlineTerminalOnboardingLinkObjectValueXbfe4e85f() {
    public override val `value`: String = "terminal.onboarding_link"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalOnboardingLinkObjectValueXbfe4e85f()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalOnboardingLinkObjectValueXbfe4e85f = when (value) {
      TerminalOnboardingLink.value -> TerminalOnboardingLink
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTerminalOnboardingLinkObjectValueXbfe4e85f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTerminalOnboardingLinkObjectValueXbfe4e85f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalOnboardingLinkObjectValueXbfe4e85f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalOnboardingLinkObjectValueXbfe4e85f) {
      encoder.encodeString(value.value)
    }
  }
}
