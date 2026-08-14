package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/_links/properties/html.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/_links/properties/html
 */
@Serializable(with = InlineRepositoryRulesetLinksHtmlX22b00dd4.Serializer::class)
public class InlineRepositoryRulesetLinksHtmlX22b00dd4(
  /**
   * The html URL of the ruleset
   */
  public val href: String? = null,
) {
  public class Builder {
    /**
     * The html URL of the ruleset
     */
    public var href: String? = null

    public fun build(): InlineRepositoryRulesetLinksHtmlX22b00dd4 = InlineRepositoryRulesetLinksHtmlX22b00dd4(
      href = href,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulesetLinksHtmlX22b00dd4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetLinksHtmlX22b00dd4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetLinksHtmlX22b00dd4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetLinksHtmlX22b00dd4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulesetLinksHtmlX22b00dd4 must be a JSON object")
      return InlineRepositoryRulesetLinksHtmlX22b00dd4(
        href = rawObject["href"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetLinksHtmlX22b00dd4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulesetLinksHtmlX22b00dd4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.href?.let { put("href", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulesetLinksHtmlX22b00dd4(block: InlineRepositoryRulesetLinksHtmlX22b00dd4.Builder.() -> Unit): InlineRepositoryRulesetLinksHtmlX22b00dd4 = InlineRepositoryRulesetLinksHtmlX22b00dd4.build(block)
