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
 * Issue Event Project Card
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-event-project-card
 */
@Serializable(with = IssueEventProjectCard.Serializer::class)
public class IssueEventProjectCard(
  public val columnName: String,
  public val id: Int,
  public val projectId: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val projectUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val previousColumnName: String? = null,
) {
  public class Builder {
    private var columnNameValue: String? = null

    public var columnName: String
      get() = requireNotNull(columnNameValue) { "columnName is required" }
      set(`value`) {
        columnNameValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var projectIdValue: Int? = null

    public var projectId: Int
      get() = requireNotNull(projectIdValue) { "projectId is required" }
      set(`value`) {
        projectIdValue = value
      }

    private var projectUrlValue: String? = null

    public var projectUrl: String
      get() = requireNotNull(projectUrlValue) { "projectUrl is required" }
      set(`value`) {
        projectUrlValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var previousColumnName: String? = null

    public fun build(): IssueEventProjectCard {
      check(columnNameValue != null) { "columnName is required" }
      check(idValue != null) { "id is required" }
      check(projectIdValue != null) { "projectId is required" }
      check(projectUrlValue != null) { "projectUrl is required" }
      check(urlValue != null) { "url is required" }
      return IssueEventProjectCard(
        columnName = columnName,
        id = id,
        projectId = projectId,
        projectUrl = projectUrl,
        url = url,
        previousColumnName = previousColumnName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueEventProjectCard = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssueEventProjectCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueEventProjectCard {
      val jsonDecoder = decoder.requireJsonDecoder("IssueEventProjectCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueEventProjectCard must be a JSON object")
      val columnName = json.decodeRequired<String>(rawObject, "column_name")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val projectId = json.decodeRequired<Int>(rawObject, "project_id")
      val projectUrl = json.decodeRequired<String>(rawObject, "project_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      return IssueEventProjectCard(
        columnName = columnName,
        id = id,
        projectId = projectId,
        projectUrl = projectUrl,
        url = url,
        previousColumnName = rawObject["previous_column_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueEventProjectCard) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueEventProjectCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("column_name", value.columnName)
        put("id", json.encodeToJsonElement(value.id))
        put("project_id", json.encodeToJsonElement(value.projectId))
        put("project_url", value.projectUrl)
        put("url", value.url)
        value.previousColumnName?.let { put("previous_column_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueEventProjectCard(block: IssueEventProjectCard.Builder.() -> Unit): IssueEventProjectCard = IssueEventProjectCard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueEventProjectCard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
