package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Represents an 'issue_title' secret scanning location type. This location type shows that a secret was detected in the
 * title of an issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-issue-title
 */
@Serializable(with = SecretScanningLocationIssueTitle.Serializer::class)
public class SecretScanningLocationIssueTitle(
  /**
   * The API URL to get the issue where the secret was detected.
   */
  public val issueTitleUrl: String,
  /**
   * The GitHub URL for the issue where the secret was detected.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var issueTitleUrlValue: String? = null

    public var issueTitleUrl: String
      get() = requireNotNull(issueTitleUrlValue) { "issueTitleUrl is required" }
      set(`value`) {
        issueTitleUrlValue = value
      }

    /**
     * The GitHub URL for the issue where the secret was detected.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationIssueTitle {
      check(issueTitleUrlValue != null) { "issueTitleUrl is required" }
      return SecretScanningLocationIssueTitle(
        issueTitleUrl = issueTitleUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationIssueTitle = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocationIssueTitle> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationIssueTitle {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationIssueTitle")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationIssueTitle must be a JSON object")
      val issueTitleUrl = json.decodeRequired<String>(rawObject, "issue_title_url")
      return SecretScanningLocationIssueTitle(
        issueTitleUrl = issueTitleUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationIssueTitle) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationIssueTitle")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("issue_title_url", value.issueTitleUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationIssueTitle(block: SecretScanningLocationIssueTitle.Builder.() -> Unit): SecretScanningLocationIssueTitle = SecretScanningLocationIssueTitle.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationIssueTitle is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
