package com.nabobery.sdkgen.github.generated

import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1repositories/get/responses/200/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1repositories/get/responses/200/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c.Serializer::class)
public class InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c(
  repositories: List<Repository>,
  public val totalCount: Double,
) {
  public val repositories: List<Repository> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<Repository>? = null

    public var repositories: List<Repository>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }
      set(`value`) {
        repositoriesValue = value
      }

    private var totalCountValue: Double? = null

    public var totalCount: Double
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c(
        repositories = repositories,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c must be a JSON object")
      val repositories = json.decodeRequired<List<Repository>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Double>(rawObject, "total_count")
      return InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c(
        repositories = repositories,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c(block: InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c.Builder.() -> Unit): InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c = InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsPermissionsRepositoriesGetResponse200JsonX6022fc7c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
