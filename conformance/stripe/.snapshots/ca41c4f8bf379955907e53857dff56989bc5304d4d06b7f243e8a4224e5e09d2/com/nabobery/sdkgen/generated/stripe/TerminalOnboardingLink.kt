package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Returns redirect links used for onboarding onto Tap to Pay on iPhone.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.onboarding_link
 */
@Serializable(with = TerminalOnboardingLink.Serializer::class)
public class TerminalOnboardingLink(
  public val linkOptions: TerminalOnboardingLinkLinkOptions,
  /**
   * The type of link being generated.
   */
  public val linkType: InlineTerminalOnboardingLinkLinkTypeXce1c713e,
  public val objectValue: InlineTerminalOnboardingLinkObjectValueXbfe4e85f,
  /**
   * The link passed back to the user for their onboarding.
   */
  public val redirectUrl: String,
  /**
   * Stripe account ID to generate the link for.
   */
  public val onBehalfOf: String? = null,
) {
  public class Builder {
    private var linkOptionsValue: TerminalOnboardingLinkLinkOptions? = null

    public var linkOptions: TerminalOnboardingLinkLinkOptions
      get() = requireNotNull(linkOptionsValue) { "linkOptions is required" }
      set(`value`) {
        linkOptionsValue = value
      }

    private var linkTypeValue: InlineTerminalOnboardingLinkLinkTypeXce1c713e? = null

    public var linkType: InlineTerminalOnboardingLinkLinkTypeXce1c713e
      get() = requireNotNull(linkTypeValue) { "linkType is required" }
      set(`value`) {
        linkTypeValue = value
      }

    private var objectValueValue: InlineTerminalOnboardingLinkObjectValueXbfe4e85f? = null

    public var objectValue: InlineTerminalOnboardingLinkObjectValueXbfe4e85f
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var redirectUrlValue: String? = null

    public var redirectUrl: String
      get() = requireNotNull(redirectUrlValue) { "redirectUrl is required" }
      set(`value`) {
        redirectUrlValue = value
      }

    /**
     * Stripe account ID to generate the link for.
     */
    public var onBehalfOf: String? = null

    public fun build(): TerminalOnboardingLink {
      check(linkOptionsValue != null) { "linkOptions is required" }
      check(linkTypeValue != null) { "linkType is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(redirectUrlValue != null) { "redirectUrl is required" }
      return TerminalOnboardingLink(
        linkOptions = linkOptions,
        linkType = linkType,
        objectValue = objectValue,
        redirectUrl = redirectUrl,
        onBehalfOf = onBehalfOf,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalOnboardingLink = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalOnboardingLink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalOnboardingLink {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalOnboardingLink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalOnboardingLink must be a JSON object")
      val linkOptions = json.decodeRequired<TerminalOnboardingLinkLinkOptions>(rawObject, "link_options")
      val linkType = json.decodeRequired<InlineTerminalOnboardingLinkLinkTypeXce1c713e>(rawObject, "link_type")
      val objectValue = json.decodeRequired<InlineTerminalOnboardingLinkObjectValueXbfe4e85f>(rawObject, "object")
      val redirectUrl = json.decodeRequired<String>(rawObject, "redirect_url")
      return TerminalOnboardingLink(
        linkOptions = linkOptions,
        linkType = linkType,
        objectValue = objectValue,
        redirectUrl = redirectUrl,
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalOnboardingLink) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalOnboardingLink")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("link_options", json.encodeToJsonElement(value.linkOptions))
        put("link_type", json.encodeToJsonElement(value.linkType))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("redirect_url", value.redirectUrl)
        value.onBehalfOf?.let { put("on_behalf_of", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalOnboardingLink(block: TerminalOnboardingLink.Builder.() -> Unit): TerminalOnboardingLink = TerminalOnboardingLink.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalOnboardingLink is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
