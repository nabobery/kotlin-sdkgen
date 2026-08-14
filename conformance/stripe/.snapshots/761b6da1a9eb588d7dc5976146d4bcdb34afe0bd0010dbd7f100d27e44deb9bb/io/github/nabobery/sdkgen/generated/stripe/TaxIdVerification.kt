package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxIdVerificationView(
  public val status: InlineTaxIdVerificationStatusX7596920a,
  @SerialName("verified_address")
  public val verifiedAddress: String? = null,
  @SerialName("verified_name")
  public val verifiedName: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_id_verification
 */
@Serializable(with = TaxIdVerification.Serializer::class)
public class TaxIdVerification(
  /**
   * Verification status, one of `pending`, `verified`, `unverified`, or `unavailable`.
   */
  public val status: InlineTaxIdVerificationStatusX7596920a,
  /**
   * Verified address.
   */
  public val verifiedAddress: String? = null,
  /**
   * Verified name.
   */
  public val verifiedName: String? = null,
) {
  public class Builder {
    private var statusValue: InlineTaxIdVerificationStatusX7596920a? = null

    public var status: InlineTaxIdVerificationStatusX7596920a
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Verified address.
     */
    public var verifiedAddress: String? = null

    /**
     * Verified name.
     */
    public var verifiedName: String? = null

    public fun build(): TaxIdVerification {
      check(statusValue != null) { "status is required" }
      return TaxIdVerification(
        status = status,
        verifiedAddress = verifiedAddress,
        verifiedName = verifiedName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxIdVerification = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxIdVerification> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxIdVerification {
      val jsonDecoder = decoder.requireJsonDecoder("TaxIdVerification")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxIdVerification must be a JSON object")
      val status = json.decodeRequired<InlineTaxIdVerificationStatusX7596920a>(rawObject, "status")
      return TaxIdVerification(
        status = status,
        verifiedAddress = rawObject["verified_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verifiedName = rawObject["verified_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxIdVerification) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxIdVerification")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.verifiedAddress?.let { put("verified_address", it) }
        value.verifiedName?.let { put("verified_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxIdVerification(block: TaxIdVerification.Builder.() -> Unit): TaxIdVerification = TaxIdVerification.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxIdVerification is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
