package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1assignees/post/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1assignees/post/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineReposIssuesAssigneesPostRequestJsonX279f0252.Serializer::class)
public class InlineReposIssuesAssigneesPostRequestJsonX279f0252(
  assignees: List<String>? = null,
) {
  /**
   * Usernames of people to assign this issue to. _NOTE: Only users with push access can add assignees to an issue.
   * Assignees are silently ignored otherwise._
   */
  public val assignees: List<String>? = assignees?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var assigneesValue: List<String>? = null

    /**
     * Usernames of people to assign this issue to. _NOTE: Only users with push access can add assignees to an issue.
     * Assignees are silently ignored otherwise._
     */
    public var assignees: List<String>?
      get() = assigneesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        assigneesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposIssuesAssigneesPostRequestJsonX279f0252 = InlineReposIssuesAssigneesPostRequestJsonX279f0252(
      assignees = assignees,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesAssigneesPostRequestJsonX279f0252 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesAssigneesPostRequestJsonX279f0252> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesAssigneesPostRequestJsonX279f0252 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesAssigneesPostRequestJsonX279f0252")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesAssigneesPostRequestJsonX279f0252 must be a JSON object")
      return InlineReposIssuesAssigneesPostRequestJsonX279f0252(
        assignees = rawObject["assignees"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesAssigneesPostRequestJsonX279f0252) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesAssigneesPostRequestJsonX279f0252")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.assignees?.let { put("assignees", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesAssigneesPostRequestJsonX279f0252(block: InlineReposIssuesAssigneesPostRequestJsonX279f0252.Builder.() -> Unit): InlineReposIssuesAssigneesPostRequestJsonX279f0252 = InlineReposIssuesAssigneesPostRequestJsonX279f0252.build(block)
