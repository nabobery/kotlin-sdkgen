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
 * Represents an 'issue_body' secret scanning location type. This location type shows that a secret was detected in the
 * body of an issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-issue-body
 */
@Serializable(with = SecretScanningLocationIssueBody.Serializer::class)
public class SecretScanningLocationIssueBody(
  /**
   * The API URL to get the issue where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueBodyUrl: String,
  /**
   * The GitHub URL for the issue where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var issueBodyUrlValue: String? = null

    public var issueBodyUrl: String
      get() = requireNotNull(issueBodyUrlValue) { "issueBodyUrl is required" }
      set(`value`) {
        issueBodyUrlValue = value
      }

    /**
     * The GitHub URL for the issue where the secret was detected.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationIssueBody {
      check(issueBodyUrlValue != null) { "issueBodyUrl is required" }
      return SecretScanningLocationIssueBody(
        issueBodyUrl = issueBodyUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationIssueBody = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocationIssueBody> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationIssueBody {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationIssueBody")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationIssueBody must be a JSON object")
      val issueBodyUrl = json.decodeRequired<String>(rawObject, "issue_body_url")
      return SecretScanningLocationIssueBody(
        issueBodyUrl = issueBodyUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationIssueBody) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationIssueBody")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("issue_body_url", value.issueBodyUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationIssueBody(block: SecretScanningLocationIssueBody.Builder.() -> Unit): SecretScanningLocationIssueBody = SecretScanningLocationIssueBody.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationIssueBody is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
