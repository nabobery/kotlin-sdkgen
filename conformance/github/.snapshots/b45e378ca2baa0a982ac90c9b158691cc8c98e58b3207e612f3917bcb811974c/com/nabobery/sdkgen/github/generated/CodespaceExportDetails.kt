package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * An export of a codespace. Also, latest export details for a codespace can be fetched with id = latest
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace-export-details
 */
@Serializable(with = CodespaceExportDetails.Serializer::class)
public class CodespaceExportDetails(
  /**
   * Name of the exported branch
   */
  public val branch: String? = null,
  /**
   * Completion time of the last export operation
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String? = null,
  /**
   * Url for fetching export details
   */
  public val exportUrl: String? = null,
  /**
   * Web url for the exported branch
   */
  public val htmlUrl: String? = null,
  /**
   * Id for the export details
   */
  public val id: String? = null,
  /**
   * Git commit SHA of the exported branch
   */
  public val sha: String? = null,
  /**
   * State of the latest export
   */
  public val state: String? = null,
) {
  public class Builder {
    /**
     * Name of the exported branch
     */
    public var branch: String? = null

    /**
     * Completion time of the last export operation
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var completedAt: String? = null

    /**
     * Url for fetching export details
     */
    public var exportUrl: String? = null

    /**
     * Web url for the exported branch
     */
    public var htmlUrl: String? = null

    /**
     * Id for the export details
     */
    public var id: String? = null

    /**
     * Git commit SHA of the exported branch
     */
    public var sha: String? = null

    /**
     * State of the latest export
     */
    public var state: String? = null

    public fun build(): CodespaceExportDetails = CodespaceExportDetails(
      branch = branch,
      completedAt = completedAt,
      exportUrl = exportUrl,
      htmlUrl = htmlUrl,
      id = id,
      sha = sha,
      state = state,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodespaceExportDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodespaceExportDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodespaceExportDetails {
      val jsonDecoder = decoder.requireJsonDecoder("CodespaceExportDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodespaceExportDetails must be a JSON object")
      return CodespaceExportDetails(
        branch = rawObject["branch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        completedAt = rawObject["completed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        exportUrl = rawObject["export_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        sha = rawObject["sha"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        state = rawObject["state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodespaceExportDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("CodespaceExportDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.branch?.let { put("branch", it) }
        value.completedAt?.let { put("completed_at", it) }
        value.exportUrl?.let { put("export_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", it) }
        value.sha?.let { put("sha", it) }
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codespaceExportDetails(block: CodespaceExportDetails.Builder.() -> Unit): CodespaceExportDetails = CodespaceExportDetails.build(block)
