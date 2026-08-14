package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/_links
 */
@Serializable(with = InlineRepositoryRulesetLinksXca1aefb2.Serializer::class)
public class InlineRepositoryRulesetLinksXca1aefb2(
  public val html: InlineRepositoryRulesetLinksHtmlX22b00dd4? = null,
  public val self: InlineRepositoryRulesetLinksSelfX6753c610? = null,
) {
  public class Builder {
    public var html: InlineRepositoryRulesetLinksHtmlX22b00dd4? = null

    public var self: InlineRepositoryRulesetLinksSelfX6753c610? = null

    public fun build(): InlineRepositoryRulesetLinksXca1aefb2 = InlineRepositoryRulesetLinksXca1aefb2(
      html = html,
      self = self,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulesetLinksXca1aefb2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetLinksXca1aefb2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetLinksXca1aefb2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetLinksXca1aefb2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulesetLinksXca1aefb2 must be a JSON object")
      return InlineRepositoryRulesetLinksXca1aefb2(
        html = rawObject["html"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRepositoryRulesetLinksHtmlX22b00dd4?>(element) },
        self = rawObject["self"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetLinksSelfX6753c610>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetLinksXca1aefb2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulesetLinksXca1aefb2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.html?.let { put("html", json.encodeToJsonElement(it)) }
        value.self?.let { put("self", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulesetLinksXca1aefb2(block: InlineRepositoryRulesetLinksXca1aefb2.Builder.() -> Unit): InlineRepositoryRulesetLinksXca1aefb2 = InlineRepositoryRulesetLinksXca1aefb2.build(block)
