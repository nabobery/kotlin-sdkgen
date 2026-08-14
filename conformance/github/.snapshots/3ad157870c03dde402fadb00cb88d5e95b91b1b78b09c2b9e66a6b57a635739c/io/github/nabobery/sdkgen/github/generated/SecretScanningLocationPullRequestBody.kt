package io.github.nabobery.sdkgen.github.generated

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
 * Represents a 'pull_request_body' secret scanning location type. This location type shows that a secret was detected
 * in the body of a pull request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-pull-request-body
 */
@Serializable(with = SecretScanningLocationPullRequestBody.Serializer::class)
public class SecretScanningLocationPullRequestBody(
  /**
   * The API URL to get the pull request where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestBodyUrl: String,
  /**
   * The GitHub URL for the pull request where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var pullRequestBodyUrlValue: String? = null

    public var pullRequestBodyUrl: String
      get() = requireNotNull(pullRequestBodyUrlValue) { "pullRequestBodyUrl is required" }
      set(`value`) {
        pullRequestBodyUrlValue = value
      }

    /**
     * The GitHub URL for the pull request where the secret was detected.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationPullRequestBody {
      check(pullRequestBodyUrlValue != null) { "pullRequestBodyUrl is required" }
      return SecretScanningLocationPullRequestBody(
        pullRequestBodyUrl = pullRequestBodyUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationPullRequestBody = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningLocationPullRequestBody> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationPullRequestBody {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationPullRequestBody")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationPullRequestBody must be a JSON object")
      val pullRequestBodyUrl = json.decodeRequired<String>(rawObject, "pull_request_body_url")
      return SecretScanningLocationPullRequestBody(
        pullRequestBodyUrl = pullRequestBodyUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationPullRequestBody) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationPullRequestBody")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pull_request_body_url", value.pullRequestBodyUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationPullRequestBody(block: SecretScanningLocationPullRequestBody.Builder.() -> Unit): SecretScanningLocationPullRequestBody = SecretScanningLocationPullRequestBody.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationPullRequestBody is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
