package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1onboarding_links/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/link_options/properties/apple_terms_and_conditions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1onboarding_links/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/link_options/properties/apple_terms_and_conditions
 */
@Serializable(with = InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50.Serializer::class)
public class InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50(
  public val merchantDisplayName: String,
  public val allowRelinking: Boolean? = null,
) {
  public class Builder {
    private var merchantDisplayNameValue: String? = null

    public var merchantDisplayName: String
      get() = requireNotNull(merchantDisplayNameValue) { "merchantDisplayName is required" }
      set(`value`) {
        merchantDisplayNameValue = value
      }

    public var allowRelinking: Boolean? = null

    public fun build(): InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50 {
      check(merchantDisplayNameValue != null) { "merchantDisplayName is required" }
      return InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50(
        merchantDisplayName = merchantDisplayName,
        allowRelinking = allowRelinking,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50 must be a JSON object")
      val merchantDisplayName = json.decodeRequired<String>(rawObject, "merchant_display_name")
      return InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50(
        merchantDisplayName = merchantDisplayName,
        allowRelinking = rawObject["allow_relinking"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("merchant_display_name", value.merchantDisplayName)
        value.allowRelinking?.let { put("allow_relinking", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50(block: InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50.Builder.() -> Unit): InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50 = InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalOnboardingacffPostRequestFormAppleTermsAndConditionsXa09ded50 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
