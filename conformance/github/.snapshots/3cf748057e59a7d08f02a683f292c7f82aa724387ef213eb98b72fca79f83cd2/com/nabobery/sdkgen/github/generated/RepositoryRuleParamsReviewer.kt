package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * A required reviewing team
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-reviewer
 */
@Serializable(with = RepositoryRuleParamsReviewer.Serializer::class)
public class RepositoryRuleParamsReviewer(
  /**
   * ID of the reviewer which must review changes to matching files.
   */
  public val id: Int,
  /**
   * The type of the reviewer
   */
  public val type: InlineRepositoryRuleParamsReviewerTypeX7d21fd18,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var typeValue: InlineRepositoryRuleParamsReviewerTypeX7d21fd18? = null

    public var type: InlineRepositoryRuleParamsReviewerTypeX7d21fd18
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleParamsReviewer {
      check(idValue != null) { "id is required" }
      check(typeValue != null) { "type is required" }
      return RepositoryRuleParamsReviewer(
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsReviewer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleParamsReviewer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsReviewer {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsReviewer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsReviewer must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val type = json.decodeRequired<InlineRepositoryRuleParamsReviewerTypeX7d21fd18>(rawObject, "type")
      return RepositoryRuleParamsReviewer(
        id = id,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsReviewer) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsReviewer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsReviewer(block: RepositoryRuleParamsReviewer.Builder.() -> Unit): RepositoryRuleParamsReviewer = RepositoryRuleParamsReviewer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsReviewer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
