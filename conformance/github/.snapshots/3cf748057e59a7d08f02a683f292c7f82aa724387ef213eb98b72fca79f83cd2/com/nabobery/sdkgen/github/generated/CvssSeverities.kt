package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/cvss-severities.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/cvss-severities
 */
@Serializable(with = CvssSeverities.Serializer::class)
public class CvssSeverities(
  public val cvssV3: InlineCvssSeveritiesCvssV3X19ae7f4b? = null,
  public val cvssV4: InlineCvssSeveritiesCvssV4X717ab880? = null,
) {
  public class Builder {
    public var cvssV3: InlineCvssSeveritiesCvssV3X19ae7f4b? = null

    public var cvssV4: InlineCvssSeveritiesCvssV4X717ab880? = null

    public fun build(): CvssSeverities = CvssSeverities(
      cvssV3 = cvssV3,
      cvssV4 = cvssV4,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CvssSeverities = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CvssSeverities> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CvssSeverities {
      val jsonDecoder = decoder.requireJsonDecoder("CvssSeverities")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CvssSeverities must be a JSON object")
      return CvssSeverities(
        cvssV3 = rawObject["cvss_v3"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCvssSeveritiesCvssV3X19ae7f4b?>(element) },
        cvssV4 = rawObject["cvss_v4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCvssSeveritiesCvssV4X717ab880?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CvssSeverities) {
      val jsonEncoder = encoder.requireJsonEncoder("CvssSeverities")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cvssV3?.let { put("cvss_v3", json.encodeToJsonElement(it)) }
        value.cvssV4?.let { put("cvss_v4", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun cvssSeverities(block: CvssSeverities.Builder.() -> Unit): CvssSeverities = CvssSeverities.build(block)
