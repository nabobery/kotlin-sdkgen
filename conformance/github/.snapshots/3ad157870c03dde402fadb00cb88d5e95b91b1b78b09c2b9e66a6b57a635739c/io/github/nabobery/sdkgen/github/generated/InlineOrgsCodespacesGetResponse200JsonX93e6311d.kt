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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCodespacesGetResponse200JsonX93e6311d.Serializer::class)
public class InlineOrgsCodespacesGetResponse200JsonX93e6311d(
  codespaces: List<Codespace>,
  public val totalCount: Int,
) {
  public val codespaces: List<Codespace> = codespaces.toList()

  public class Builder {
    private var codespacesValue: List<Codespace>? = null

    public var codespaces: List<Codespace>
      get() = requireNotNull(codespacesValue) { "codespaces is required" }.toList()
      set(`value`) {
        codespacesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsCodespacesGetResponse200JsonX93e6311d {
      check(codespacesValue != null) { "codespaces is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsCodespacesGetResponse200JsonX93e6311d(
        codespaces = codespaces,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesGetResponse200JsonX93e6311d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodespacesGetResponse200JsonX93e6311d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesGetResponse200JsonX93e6311d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesGetResponse200JsonX93e6311d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesGetResponse200JsonX93e6311d must be a JSON object")
      val codespaces = json.decodeRequired<List<Codespace>>(rawObject, "codespaces")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsCodespacesGetResponse200JsonX93e6311d(
        codespaces = codespaces,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesGetResponse200JsonX93e6311d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesGetResponse200JsonX93e6311d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("codespaces", json.encodeToJsonElement(value.codespaces))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesGetResponse200JsonX93e6311d(block: InlineOrgsCodespacesGetResponse200JsonX93e6311d.Builder.() -> Unit): InlineOrgsCodespacesGetResponse200JsonX93e6311d = InlineOrgsCodespacesGetResponse200JsonX93e6311d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesGetResponse200JsonX93e6311d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
