package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Link type options associated with the current onboarding link object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_onboarding_link_link_options
 */
@Serializable(with = TerminalOnboardingLinkLinkOptions.Serializer::class)
public class TerminalOnboardingLinkLinkOptions(
  /**
   * The options associated with the Apple Terms and Conditions link type.
   */
  public val appleTermsAndConditions:
      InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f? = null,
) {
  public class Builder {
    /**
     * The options associated with the Apple Terms and Conditions link type.
     */
    public var appleTermsAndConditions:
        InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f? = null

    public fun build(): TerminalOnboardingLinkLinkOptions = TerminalOnboardingLinkLinkOptions(
      appleTermsAndConditions = appleTermsAndConditions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalOnboardingLinkLinkOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalOnboardingLinkLinkOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalOnboardingLinkLinkOptions {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalOnboardingLinkLinkOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalOnboardingLinkLinkOptions must be a JSON object")
      return TerminalOnboardingLinkLinkOptions(
        appleTermsAndConditions = rawObject["apple_terms_and_conditions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTerminalOnboardingLinkLinkOptionsAppleTermsAndConditionsX08bd151f?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalOnboardingLinkLinkOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalOnboardingLinkLinkOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.appleTermsAndConditions?.let { put("apple_terms_and_conditions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalOnboardingLinkLinkOptions(block: TerminalOnboardingLinkLinkOptions.Builder.() -> Unit): TerminalOnboardingLinkLinkOptions = TerminalOnboardingLinkLinkOptions.build(block)
