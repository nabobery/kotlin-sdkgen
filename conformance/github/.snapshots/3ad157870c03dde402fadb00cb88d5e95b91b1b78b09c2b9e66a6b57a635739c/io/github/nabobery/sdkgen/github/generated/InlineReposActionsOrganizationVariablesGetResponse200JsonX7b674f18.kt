package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1organization-variables/get/responses/200/conte
 * nt/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1organization-variables/get/responses/200/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18.Serializer::class)
public class InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18(
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
      get() = requireNotNull(variablesValue) { "variables is required" }.toList()
      set(`value`) {
        variablesValue = value.toList()
      }

    public fun build(): InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18 {
      check(totalCountValue != null) { "totalCount is required" }
      check(variablesValue != null) { "variables is required" }
      return InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18(
        totalCount = totalCount,
        variables = variables,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18 must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val variables = json.decodeRequired<List<ActionsVariable>>(rawObject, "variables")
      return InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18(
        totalCount = totalCount,
        variables = variables,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("variables", json.encodeToJsonElement(value.variables))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18(block: InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18.Builder.() -> Unit): InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18 = InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsOrganizationVariablesGetResponse200JsonX7b674f18 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
