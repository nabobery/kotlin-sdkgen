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
 * Represents a 'pull_request_title' secret scanning location type. This location type shows that a secret was detected
 * in the title of a pull request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-pull-request-title
 */
@Serializable(with = SecretScanningLocationPullRequestTitle.Serializer::class)
public class SecretScanningLocationPullRequestTitle(
  /**
   * The API URL to get the pull request where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestTitleUrl: String,
  /**
   * The GitHub URL for the pull request where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var pullRequestTitleUrlValue: String? = null

    public var pullRequestTitleUrl: String
      get() = requireNotNull(pullRequestTitleUrlValue) { "pullRequestTitleUrl is required" }
      set(`value`) {
        pullRequestTitleUrlValue = value
      }

    /**
     * The GitHub URL for the pull request where the secret was detected.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationPullRequestTitle {
      check(pullRequestTitleUrlValue != null) { "pullRequestTitleUrl is required" }
      return SecretScanningLocationPullRequestTitle(
        pullRequestTitleUrl = pullRequestTitleUrl,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationPullRequestTitle = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningLocationPullRequestTitle> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationPullRequestTitle {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationPullRequestTitle")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationPullRequestTitle must be a JSON object")
      val pullRequestTitleUrl = json.decodeRequired<String>(rawObject, "pull_request_title_url")
      return SecretScanningLocationPullRequestTitle(
        pullRequestTitleUrl = pullRequestTitleUrl,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationPullRequestTitle) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationPullRequestTitle")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pull_request_title_url", value.pullRequestTitleUrl)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationPullRequestTitle(block: SecretScanningLocationPullRequestTitle.Builder.() -> Unit): SecretScanningLocationPullRequestTitle = SecretScanningLocationPullRequestTitle.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationPullRequestTitle is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
