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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineUserCodespacesGetResponse200JsonX10571de7.Serializer::class)
public class InlineUserCodespacesGetResponse200JsonX10571de7(
  codespaces: List<Codespace>,
  public val totalCount: Int,
) {
  public val codespaces: List<Codespace> = codespaces.toList()

  public class Builder {
    private var codespacesValue: List<Codespace>? = null

    public var codespaces: List<Codespace>
      get() = requireNotNull(codespacesValue) { "codespaces is required" }
      set(`value`) {
        codespacesValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineUserCodespacesGetResponse200JsonX10571de7 {
      check(codespacesValue != null) { "codespaces is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineUserCodespacesGetResponse200JsonX10571de7(
        codespaces = codespaces,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesGetResponse200JsonX10571de7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesGetResponse200JsonX10571de7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesGetResponse200JsonX10571de7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesGetResponse200JsonX10571de7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesGetResponse200JsonX10571de7 must be a JSON object")
      val codespaces = json.decodeRequired<List<Codespace>>(rawObject, "codespaces")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineUserCodespacesGetResponse200JsonX10571de7(
        codespaces = codespaces,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesGetResponse200JsonX10571de7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesGetResponse200JsonX10571de7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("codespaces", json.encodeToJsonElement(value.codespaces))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesGetResponse200JsonX10571de7(block: InlineUserCodespacesGetResponse200JsonX10571de7.Builder.() -> Unit): InlineUserCodespacesGetResponse200JsonX10571de7 = InlineUserCodespacesGetResponse200JsonX10571de7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesGetResponse200JsonX10571de7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
