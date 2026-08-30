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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables/get/responses/200/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables/get/responses/200/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsActionsVariablesGetResponse200JsonXc791d75e.Serializer::class)
public class InlineOrgsActionsVariablesGetResponse200JsonXc791d75e(
  public val totalCount: Int,
  variables: List<OrganizationActionsVariable>,
) {
  public val variables: List<OrganizationActionsVariable> = variables.toList()

  public class Builder {
    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var variablesValue: List<OrganizationActionsVariable>? = null

    public var variables: List<OrganizationActionsVariable>
      get() = requireNotNull(variablesValue) { "variables is required" }.toList()
      set(`value`) {
        variablesValue = value.toList()
      }

    public fun build(): InlineOrgsActionsVariablesGetResponse200JsonXc791d75e {
      check(totalCountValue != null) { "totalCount is required" }
      check(variablesValue != null) { "variables is required" }
      return InlineOrgsActionsVariablesGetResponse200JsonXc791d75e(
        totalCount = totalCount,
        variables = variables,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsVariablesGetResponse200JsonXc791d75e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsVariablesGetResponse200JsonXc791d75e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsVariablesGetResponse200JsonXc791d75e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsVariablesGetResponse200JsonXc791d75e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsVariablesGetResponse200JsonXc791d75e must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val variables = json.decodeRequired<List<OrganizationActionsVariable>>(rawObject, "variables")
      return InlineOrgsActionsVariablesGetResponse200JsonXc791d75e(
        totalCount = totalCount,
        variables = variables,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsVariablesGetResponse200JsonXc791d75e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsVariablesGetResponse200JsonXc791d75e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("variables", json.encodeToJsonElement(value.variables))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsVariablesGetResponse200JsonXc791d75e(block: InlineOrgsActionsVariablesGetResponse200JsonXc791d75e.Builder.() -> Unit): InlineOrgsActionsVariablesGetResponse200JsonXc791d75e = InlineOrgsActionsVariablesGetResponse200JsonXc791d75e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsVariablesGetResponse200JsonXc791d75e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
