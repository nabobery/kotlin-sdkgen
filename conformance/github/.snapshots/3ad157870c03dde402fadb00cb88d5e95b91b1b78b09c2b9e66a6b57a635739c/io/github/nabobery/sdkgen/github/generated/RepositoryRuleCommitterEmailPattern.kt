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
 * Parameters to be used for the committer_email_pattern rule
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-committer-email-pattern
 */
@Serializable(with = RepositoryRuleCommitterEmailPattern.Serializer::class)
public class RepositoryRuleCommitterEmailPattern(
  public val type: InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc,
  public val parameters: InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc? = null

    public var type: InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2? = null

    public fun build(): RepositoryRuleCommitterEmailPattern {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleCommitterEmailPattern(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleCommitterEmailPattern = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleCommitterEmailPattern> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleCommitterEmailPattern {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleCommitterEmailPattern")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleCommitterEmailPattern must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc>(rawObject, "type")
      return RepositoryRuleCommitterEmailPattern(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleCommitterEmailPattern) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleCommitterEmailPattern")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleCommitterEmailPattern(block: RepositoryRuleCommitterEmailPattern.Builder.() -> Unit): RepositoryRuleCommitterEmailPattern = RepositoryRuleCommitterEmailPattern.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleCommitterEmailPattern is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
