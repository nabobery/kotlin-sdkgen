package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The organization policy for allowing or blocking suggestions matching public code (duplication detection filter).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-details/properties/public_code_suggestions
 */
@Serializable(with = InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c.Serializer::class)
public sealed class InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `allow`.
   */
  public data object Allow : InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c() {
    public override val `value`: String = "allow"
  }

  /**
   * Documented value. Wire value: `block`.
   */
  public data object Block : InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c() {
    public override val `value`: String = "block"
  }

  /**
   * Documented value. Wire value: `unconfigured`.
   */
  public data object Unconfigured : InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c() {
    public override val `value`: String = "unconfigured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c = when (value) {
      Allow.value -> Allow
      Block.value -> Block
      Unconfigured.value -> Unconfigured
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c) {
      encoder.encodeString(value.value)
    }
  }
}
