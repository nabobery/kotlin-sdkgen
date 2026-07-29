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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1commits~1{ref}~1check-suites/get/responses/200/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1commits~1{ref}~1check-suites/get/responses/200/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177.Serializer::class)
public class InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177(
  checkSuites: List<CheckSuite>,
  public val totalCount: Int,
) {
  public val checkSuites: List<CheckSuite> = checkSuites.toList()

  public class Builder {
    private var checkSuitesValue: List<CheckSuite>? = null

    public var checkSuites: List<CheckSuite>
      get() = requireNotNull(checkSuitesValue) { "checkSuites is required" }.toList()
      set(`value`) {
        checkSuitesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177 {
      check(checkSuitesValue != null) { "checkSuites is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177(
        checkSuites = checkSuites,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177 must be a JSON object")
      val checkSuites = json.decodeRequired<List<CheckSuite>>(rawObject, "check_suites")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177(
        checkSuites = checkSuites,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("check_suites", json.encodeToJsonElement(value.checkSuites))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177(block: InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177.Builder.() -> Unit): InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177 = InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
