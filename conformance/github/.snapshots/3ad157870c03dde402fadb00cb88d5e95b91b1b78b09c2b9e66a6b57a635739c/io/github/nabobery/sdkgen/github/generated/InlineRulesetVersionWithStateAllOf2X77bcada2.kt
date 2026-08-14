package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ruleset-version-with-state/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ruleset-version-with-state/allOf/1
 */
@Serializable(with = InlineRulesetVersionWithStateAllOf2X77bcada2.Serializer::class)
public class InlineRulesetVersionWithStateAllOf2X77bcada2(
  /**
   * The state of the ruleset version
   */
  public val state: JsonObject,
) {
  public class Builder {
    private var stateValue: JsonObject? = null

    public var state: JsonObject
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    public fun build(): InlineRulesetVersionWithStateAllOf2X77bcada2 {
      check(stateValue != null) { "state is required" }
      return InlineRulesetVersionWithStateAllOf2X77bcada2(
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRulesetVersionWithStateAllOf2X77bcada2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRulesetVersionWithStateAllOf2X77bcada2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRulesetVersionWithStateAllOf2X77bcada2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRulesetVersionWithStateAllOf2X77bcada2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRulesetVersionWithStateAllOf2X77bcada2 must be a JSON object")
      val state = json.decodeRequired<JsonObject>(rawObject, "state")
      return InlineRulesetVersionWithStateAllOf2X77bcada2(
        state = state,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRulesetVersionWithStateAllOf2X77bcada2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRulesetVersionWithStateAllOf2X77bcada2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("state", json.encodeToJsonElement(value.state))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRulesetVersionWithStateAllOf2X77bcada2(block: InlineRulesetVersionWithStateAllOf2X77bcada2.Builder.() -> Unit): InlineRulesetVersionWithStateAllOf2X77bcada2 = InlineRulesetVersionWithStateAllOf2X77bcada2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRulesetVersionWithStateAllOf2X77bcada2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
