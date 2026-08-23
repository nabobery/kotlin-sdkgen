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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries/get/responses/200/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries/get/responses/200/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155.Serializer::class)
public class InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155(
  configurations: List<OrgPrivateRegistryConfiguration>,
  public val totalCount: Int,
) {
  public val configurations: List<OrgPrivateRegistryConfiguration> = configurations.toList()

  public class Builder {
    private var configurationsValue: List<OrgPrivateRegistryConfiguration>? = null

    public var configurations: List<OrgPrivateRegistryConfiguration>
      get() = requireNotNull(configurationsValue) { "configurations is required" }.toList()
      set(`value`) {
        configurationsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155 {
      check(configurationsValue != null) { "configurations is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155(
        configurations = configurations,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155 must be a JSON object")
      val configurations = json.decodeRequired<List<OrgPrivateRegistryConfiguration>>(rawObject, "configurations")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155(
        configurations = configurations,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("configurations", json.encodeToJsonElement(value.configurations))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPrivateRegistriesGetResponse200JsonX9868d155(block: InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155.Builder.() -> Unit): InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155 = InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPrivateRegistriesGetResponse200JsonX9868d155 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
