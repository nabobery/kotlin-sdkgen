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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1assignees/delete/requestBody/co
 * ntent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1assignees/delete/requestBody/co
 * ntent/application~1json/schema
 */
@Serializable(with = InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c.Serializer::class)
public class InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c(
  /**
   * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an
   * issue. Assignees are silently ignored otherwise._
   */
  public val assignees: List<String>? = null,
) {
  public class Builder {
    /**
     * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an
     * issue. Assignees are silently ignored otherwise._
     */
    public var assignees: List<String>? = null

    public fun build(): InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c = InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c(
      assignees = assignees,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c must be a JSON object")
      return InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c(
        assignees = rawObject["assignees"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.assignees?.let { put("assignees", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesAssigneesDeleteRequestJsonX13e1861c(block: InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c.Builder.() -> Unit): InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c = InlineReposIssuesAssigneesDeleteRequestJsonX13e1861c.build(block)
