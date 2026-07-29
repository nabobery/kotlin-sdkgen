package com.nabobery.sdkgen.github.generated

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
 * Choose which status checks must pass before the ref is updated. When enabled, commits must first be pushed to another
 * ref where the checks pass.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-status-checks
 */
@Serializable(with = RepositoryRuleRequiredStatusChecks.Serializer::class)
public class RepositoryRuleRequiredStatusChecks(
  public val type: InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d,
  public val parameters: InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d? = null

    public var type: InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d? = null

    public fun build(): RepositoryRuleRequiredStatusChecks {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleRequiredStatusChecks(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleRequiredStatusChecks = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleRequiredStatusChecks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleRequiredStatusChecks {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleRequiredStatusChecks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleRequiredStatusChecks must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d>(rawObject, "type")
      return RepositoryRuleRequiredStatusChecks(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleRequiredStatusChecks) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleRequiredStatusChecks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleRequiredStatusChecks(block: RepositoryRuleRequiredStatusChecks.Builder.() -> Unit): RepositoryRuleRequiredStatusChecks = RepositoryRuleRequiredStatusChecks.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleRequiredStatusChecks is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
