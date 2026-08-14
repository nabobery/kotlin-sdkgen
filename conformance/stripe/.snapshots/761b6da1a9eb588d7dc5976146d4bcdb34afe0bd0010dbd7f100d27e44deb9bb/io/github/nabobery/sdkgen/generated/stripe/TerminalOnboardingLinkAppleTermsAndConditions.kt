package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TerminalOnboardingLinkAppleTermsAndConditionsView(
  @SerialName("allow_relinking")
  public val allowRelinking: Boolean? = null,
  @SerialName("merchant_display_name")
  public val merchantDisplayName: String,
)

/**
 * Options associated with the Apple Terms and Conditions link type.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_onboarding_link_apple_terms_and_conditions
 */
@Serializable(with = TerminalOnboardingLinkAppleTermsAndConditions.Serializer::class)
public class TerminalOnboardingLinkAppleTermsAndConditions(
  /**
   * The business name of the merchant accepting Apple's Terms and Conditions.
   */
  public val merchantDisplayName: String,
  /**
   * Whether the link should also support users relinking their Apple account.
   */
  public val allowRelinking: Boolean? = null,
) {
  public class Builder {
    private var merchantDisplayNameValue: String? = null

    public var merchantDisplayName: String
      get() = requireNotNull(merchantDisplayNameValue) { "merchantDisplayName is required" }
      set(`value`) {
        merchantDisplayNameValue = value
      }

    /**
     * Whether the link should also support users relinking their Apple account.
     */
    public var allowRelinking: Boolean? = null

    public fun build(): TerminalOnboardingLinkAppleTermsAndConditions {
      check(merchantDisplayNameValue != null) { "merchantDisplayName is required" }
      return TerminalOnboardingLinkAppleTermsAndConditions(
        merchantDisplayName = merchantDisplayName,
        allowRelinking = allowRelinking,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalOnboardingLinkAppleTermsAndConditions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalOnboardingLinkAppleTermsAndConditions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalOnboardingLinkAppleTermsAndConditions {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalOnboardingLinkAppleTermsAndConditions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalOnboardingLinkAppleTermsAndConditions must be a JSON object")
      val merchantDisplayName = json.decodeRequired<String>(rawObject, "merchant_display_name")
      return TerminalOnboardingLinkAppleTermsAndConditions(
        merchantDisplayName = merchantDisplayName,
        allowRelinking = rawObject["allow_relinking"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalOnboardingLinkAppleTermsAndConditions) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalOnboardingLinkAppleTermsAndConditions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("merchant_display_name", value.merchantDisplayName)
        value.allowRelinking?.let { put("allow_relinking", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalOnboardingLinkAppleTermsAndConditions(block: TerminalOnboardingLinkAppleTermsAndConditions.Builder.() -> Unit): TerminalOnboardingLinkAppleTermsAndConditions = TerminalOnboardingLinkAppleTermsAndConditions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalOnboardingLinkAppleTermsAndConditions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
