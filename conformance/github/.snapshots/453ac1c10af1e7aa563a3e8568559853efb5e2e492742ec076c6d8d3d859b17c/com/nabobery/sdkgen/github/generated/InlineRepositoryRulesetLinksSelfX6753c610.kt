package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/_links/properties/self.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/_links/properties/self
 */
@Serializable(with = InlineRepositoryRulesetLinksSelfX6753c610.Serializer::class)
public class InlineRepositoryRulesetLinksSelfX6753c610(
  /**
   * The URL of the ruleset
   */
  public val href: String? = null,
) {
  public class Builder {
    /**
     * The URL of the ruleset
     */
    public var href: String? = null

    public fun build(): InlineRepositoryRulesetLinksSelfX6753c610 = InlineRepositoryRulesetLinksSelfX6753c610(
      href = href,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulesetLinksSelfX6753c610 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRulesetLinksSelfX6753c610> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetLinksSelfX6753c610 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetLinksSelfX6753c610")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulesetLinksSelfX6753c610 must be a JSON object")
      return InlineRepositoryRulesetLinksSelfX6753c610(
        href = rawObject["href"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetLinksSelfX6753c610) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulesetLinksSelfX6753c610")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.href?.let { put("href", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulesetLinksSelfX6753c610(block: InlineRepositoryRulesetLinksSelfX6753c610.Builder.() -> Unit): InlineRepositoryRulesetLinksSelfX6753c610 = InlineRepositoryRulesetLinksSelfX6753c610.build(block)
