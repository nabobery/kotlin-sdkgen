package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The GitHub App associated with the status check.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite-required-status-checks/properties/checks/items/properties
 * /app
 */
@Serializable(with = InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261.Serializer::class)
public class InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261(
  /**
   * The unique identifier of the GitHub App.
   */
  public val id: Int? = null,
  /**
   * The name of the GitHub App.
   */
  public val name: String? = null,
  /**
   * The slug of the GitHub App.
   */
  public val slug: String? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the GitHub App.
     */
    public var id: Int? = null

    /**
     * The name of the GitHub App.
     */
    public var name: String? = null

    /**
     * The slug of the GitHub App.
     */
    public var slug: String? = null

    public fun build(): InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261 = InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261(
      id = id,
      name = name,
      slug = slug,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261 must be a JSON object")
      return InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        slug = rawObject["slug"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.slug?.let { put("slug", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261(block: InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261.Builder.() -> Unit): InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261 = InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261.build(block)
