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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/rule_evaluations/items/properties/rule_source.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/rule_evaluations/items/properties/rule_source
 */
@Serializable(with = InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3.Serializer::class)
public class InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3(
  /**
   * The ID of the rule source.
   */
  public val id: Int? = null,
  /**
   * The name of the rule source.
   */
  public val name: String? = null,
  /**
   * The type of rule source.
   */
  public val type: String? = null,
) {
  public class Builder {
    /**
     * The ID of the rule source.
     */
    public var id: Int? = null

    /**
     * The name of the rule source.
     */
    public var name: String? = null

    /**
     * The type of rule source.
     */
    public var type: String? = null

    public fun build(): InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3 = InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3(
      id = id,
      name = name,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3 must be a JSON object")
      return InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3(
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3(block: InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3.Builder.() -> Unit): InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3 = InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3.build(block)
