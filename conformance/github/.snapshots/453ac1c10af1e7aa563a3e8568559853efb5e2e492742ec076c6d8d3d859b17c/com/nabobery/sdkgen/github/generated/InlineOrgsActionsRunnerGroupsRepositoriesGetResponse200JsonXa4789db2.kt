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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1repositories/get/respon
 * ses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}~1repositories/get/respon
 * ses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2.Serializer::class)
public class InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2(
  repositories: List<MinimalRepository>,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val totalCount: Double,
) {
  public val repositories: List<MinimalRepository> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<MinimalRepository>? = null

    public var repositories: List<MinimalRepository>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }.toList()
      set(`value`) {
        repositoriesValue = value.toList()
      }

    private var totalCountValue: Double? = null

    public var totalCount: Double
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2 {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2(
        repositories = repositories,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2 must be a JSON object")
      val repositories = json.decodeRequired<List<MinimalRepository>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Double>(rawObject, "total_count")
      return InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2(
        repositories = repositories,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2(block: InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2.Builder.() -> Unit): InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2 = InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnerGroupsRepositoriesGetResponse200JsonXa4789db2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
