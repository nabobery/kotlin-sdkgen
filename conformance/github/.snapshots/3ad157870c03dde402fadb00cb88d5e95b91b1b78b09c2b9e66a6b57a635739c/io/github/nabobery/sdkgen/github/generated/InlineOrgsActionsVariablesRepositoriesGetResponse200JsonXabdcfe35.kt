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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables~1{name}~1repositories/get/responses/200/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables~1{name}~1repositories/get/responses/200/content
 * /application~1json/schema
 */
@Serializable(with = InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35.Serializer::class)
public class InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35(
  repositories: List<MinimalRepository>,
  public val totalCount: Int,
) {
  public val repositories: List<MinimalRepository> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<MinimalRepository>? = null

    public var repositories: List<MinimalRepository>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }.toList()
      set(`value`) {
        repositoriesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35 {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35(
        repositories = repositories,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35 must be a JSON object")
      val repositories = json.decodeRequired<List<MinimalRepository>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35(
        repositories = repositories,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35(block: InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35.Builder.() -> Unit): InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35 = InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsVariablesRepositoriesGetResponse200JsonXabdcfe35 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
