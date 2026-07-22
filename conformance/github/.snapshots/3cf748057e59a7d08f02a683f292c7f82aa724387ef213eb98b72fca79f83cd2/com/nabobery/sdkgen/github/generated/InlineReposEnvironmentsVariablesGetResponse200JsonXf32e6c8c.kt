package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1variables/get/respons
 * es/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1variables/get/respons
 * es/200/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c.Serializer::class)
public class InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c(
  public val totalCount: Int,
  variables: List<ActionsVariable>,
) {
  public val variables: List<ActionsVariable> = variables.toList()

  public class Builder {
    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var variablesValue: List<ActionsVariable>? = null

    public var variables: List<ActionsVariable>
      get() = requireNotNull(variablesValue) { "variables is required" }
      set(`value`) {
        variablesValue = value
      }

    public fun build(): InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c {
      check(totalCountValue != null) { "totalCount is required" }
      check(variablesValue != null) { "variables is required" }
      return InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c(
        totalCount = totalCount,
        variables = variables,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val variables = json.decodeRequired<List<ActionsVariable>>(rawObject, "variables")
      return InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c(
        totalCount = totalCount,
        variables = variables,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("variables", json.encodeToJsonElement(value.variables))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c(block: InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c.Builder.() -> Unit): InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c = InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposEnvironmentsVariablesGetResponse200JsonXf32e6c8c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
