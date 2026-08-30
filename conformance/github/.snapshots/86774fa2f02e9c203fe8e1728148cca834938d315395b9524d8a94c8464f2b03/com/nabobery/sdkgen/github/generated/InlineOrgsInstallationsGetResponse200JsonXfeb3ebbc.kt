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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1installations/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1installations/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc.Serializer::class)
public class InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc(
  installations: List<Installation>,
  public val totalCount: Int,
) {
  public val installations: List<Installation> = installations.toList()

  public class Builder {
    private var installationsValue: List<Installation>? = null

    public var installations: List<Installation>
      get() = requireNotNull(installationsValue) { "installations is required" }.toList()
      set(`value`) {
        installationsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc {
      check(installationsValue != null) { "installations is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc(
        installations = installations,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc must be a JSON object")
      val installations = json.decodeRequired<List<Installation>>(rawObject, "installations")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc(
        installations = installations,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("installations", json.encodeToJsonElement(value.installations))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsInstallationsGetResponse200JsonXfeb3ebbc(block: InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc.Builder.() -> Unit): InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc = InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsInstallationsGetResponse200JsonXfeb3ebbc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
