package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * -urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1onboarding_links/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema
 */
@Serializable(with = InlineV1TerminalOnboardingLinksPostRequestFormXcee20784.Serializer::class)
public class InlineV1TerminalOnboardingLinksPostRequestFormXcee20784(
  /**
   * Specific fields needed to generate the desired link type.
   */
  public val linkOptions: InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29,
  /**
   * The type of link being generated.
   */
  public val linkType: InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87,
  expand: List<String>? = null,
  /**
   * Stripe account ID to generate the link for.
   */
  public val onBehalfOf: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var linkOptionsValue:
        InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29? = null

    public var linkOptions: InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29
      get() = requireNotNull(linkOptionsValue) { "linkOptions is required" }
      set(`value`) {
        linkOptionsValue = value
      }

    private var linkTypeValue: InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87? =
        null

    public var linkType: InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87
      get() = requireNotNull(linkTypeValue) { "linkType is required" }
      set(`value`) {
        linkTypeValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Stripe account ID to generate the link for.
     */
    public var onBehalfOf: String? = null

    public fun build(): InlineV1TerminalOnboardingLinksPostRequestFormXcee20784 {
      check(linkOptionsValue != null) { "linkOptions is required" }
      check(linkTypeValue != null) { "linkType is required" }
      return InlineV1TerminalOnboardingLinksPostRequestFormXcee20784(
        linkOptions = linkOptions,
        linkType = linkType,
        expand = expand,
        onBehalfOf = onBehalfOf,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalOnboardingLinksPostRequestFormXcee20784 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalOnboardingLinksPostRequestFormXcee20784> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalOnboardingLinksPostRequestFormXcee20784 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalOnboardingLinksPostRequestFormXcee20784")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalOnboardingLinksPostRequestFormXcee20784 must be a JSON object")
      val linkOptions = json.decodeRequired<InlineV1TerminalOnboardingLinksPostRequestFormLinkOptionsX87ed1f29>(rawObject, "link_options")
      val linkType = json.decodeRequired<InlineV1TerminalOnboardingLinksPostRequestFormLinkTypeX3073ad87>(rawObject, "link_type")
      return InlineV1TerminalOnboardingLinksPostRequestFormXcee20784(
        linkOptions = linkOptions,
        linkType = linkType,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalOnboardingLinksPostRequestFormXcee20784) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalOnboardingLinksPostRequestFormXcee20784")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("link_options", json.encodeToJsonElement(value.linkOptions))
        put("link_type", json.encodeToJsonElement(value.linkType))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalOnboardingLinksPostRequestFormXcee20784(block: InlineV1TerminalOnboardingLinksPostRequestFormXcee20784.Builder.() -> Unit): InlineV1TerminalOnboardingLinksPostRequestFormXcee20784 = InlineV1TerminalOnboardingLinksPostRequestFormXcee20784.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalOnboardingLinksPostRequestFormXcee20784 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
